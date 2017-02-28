package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OshiPlugin implements EnvironmentPlugin {

    private Set<Tuple> set;

    public Set<Tuple> getProperties() {
        set = new TreeSet();


        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();

        set.add(new Tuple("Os", os.toString()));
        printProcessor(hal.getProcessor());
        printMemory(hal.getMemory());
        printNetworkParameters(os.getNetworkParams());
        printDisks(hal.getDiskStores());

        return set;
    }

    public String getTitle() {
        return "Hardware";
    }

    private void printProcessor(CentralProcessor processor) {
        set.add(new Tuple("", processor.toString()));
        set.add(new Tuple("physical CPU(s)", String.valueOf(processor.getPhysicalProcessorCount())));
        set.add(new Tuple("logical CPU(s)", String.valueOf(processor.getLogicalProcessorCount())));
        set.add(new Tuple("Identifier", processor.getIdentifier()));
        set.add(new Tuple("ProcessorID", processor.getProcessorID()));
    }

    private void printMemory(GlobalMemory memory) {
        set.add(new Tuple("Memory", FormatUtil.formatBytes(memory.getAvailable()) + "/"
                + FormatUtil.formatBytes(memory.getTotal())));
        set.add(new Tuple("Swap used", FormatUtil.formatBytes(memory.getSwapUsed()) + "/"
                + FormatUtil.formatBytes(memory.getSwapTotal())));
    }


    private void printNetworkParameters(NetworkParams networkParams) {
        set.add(new Tuple("Network parameters:", ""));
        set.add(new Tuple("", String.format(" Host name: %s", networkParams.getHostName())));
        set.add(new Tuple("", String.format(" Domain name: %s", networkParams.getDomainName())));
        set.add(new Tuple("", String.format(" DNS servers: %s", Arrays.toString(networkParams.getDnsServers()))));
        set.add(new Tuple("", String.format(" IPv4 Gateway: %s", networkParams.getIpv4DefaultGateway())));
        set.add(new Tuple("", String.format(" IPv6 Gateway: %s", networkParams.getIpv6DefaultGateway())));
    }


    private void printDisks(HWDiskStore[] diskStores) {
        set.add(new Tuple("Disks:", ""));
        for (HWDiskStore disk : diskStores) {
            boolean readwrite = disk.getReads() > 0 || disk.getWrites() > 0;
            set.add(new Tuple("", String.format(" %s: (model: %s - S/N: %s) size: %s, reads: %s (%s), writes: %s (%s), xfer: %s ms",
                    disk.getName(), disk.getModel(), disk.getSerial(),
                    disk.getSize() > 0 ? FormatUtil.formatBytesDecimal(disk.getSize()) : "?",
                    readwrite ? disk.getReads() : "?", readwrite ? FormatUtil.formatBytes(disk.getReadBytes()) : "?",
                    readwrite ? disk.getWrites() : "?", readwrite ? FormatUtil.formatBytes(disk.getWriteBytes()) : "?",
                    readwrite ? disk.getTransferTime() : "?")));
            HWPartition[] partitions = disk.getPartitions();
            if (partitions == null) {
                // TODO Remove when all OS's implemented
                continue;
            }
            for (HWPartition part : partitions) {
                set.add(new Tuple("", String.format(" |-- %s: %s (%s) Maj:Min=%d:%d, size: %s", part.getIdentification(),
                        part.getName(), part.getType(), part.getMajor(), part.getMinor(),
                        FormatUtil.formatBytesDecimal(part.getSize()))));
            }
        }
    }


}