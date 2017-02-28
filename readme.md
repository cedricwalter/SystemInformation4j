# SystemInformation4j
SystemInformation4j can be integrated into any java project, its purpose is to print in the log files, ideally at process startup some relevant information.

### Here is an example:
```
Hardware
                     Os                        = Microsoft Windows 10 build 14393
                                               = Intel(R) Core(TM) i7-3540M CPU @ 3.00GHz
                     physical CPU(s)           = 2                        
                     logical CPU(s)            = 4                        
                     Identifier                = Intel64 Family 6 Model 58 Stepping 9
                     ProcessorID               = xxxxxxxxxxxxxxxxxxxxxxxx         
                     Memory                    = 6.2 GiB/15.9 GiB         
                     Swap used                 = 3.4 GiB/3.5 GiB          
                     Network parameters:       =                          
                                               =  Host name: xxxxxxx        
                                               =  Domain name: xxxxxx      
                                               =  DNS servers: [192.x.1.1]
                                               =  IPv4 Gateway: 192.x.1.1
                                               =  IPv6 Gateway:           
                     Disks:                    =                          
                                               =  \\.\PHYSICALDRIVE0: (model: Samsung SSD 850 PRO 512GB (Standard disk drives) - S/N: S2BENWAG307076F) size: 512.1 GB, reads: 17673078 (948.5 GiB), writes: 11899273 (658.2 GiB), xfer: 23458208 ms
                                               =  |-- Disk #0, Partition #0: Installable File System (Installable File System) Maj:Min=0:0, size: 367.0 MB
                                               =  |-- Disk #0, Partition #1: Installable File System (Installable File System) Maj:Min=0:1, size: 510.0 GB
                                               =  |-- Disk #0, Partition #2: Unknown (Unknown) Maj:Min=0:2, size: 849.3 MB
Java Runtime
                     Total memory (MB)         = 245                      
                     Free memory (MB)          = 210                      
                     Used memory (MB)          = 34                       
                     Max memory (MB)           = 3627                     

System properties
                     java.runtime.name         = Java(TM) SE Runtime Environment
                     sun.boot.library.path     = C:\Program Files\Java\jdk1.8.0_112\jre\bin
                     java.vm.version           = 25.112-b15               
                     java.vm.vendor            = Oracle Corporation       
                     java.vendor.url           = http://java.oracle.com/  
                     path.separator            = ;                        
                     java.vm.name              = Java HotSpot(TM) 64-Bit Server VM
                     file.encoding.pkg         = sun.io                   
                     jna.loaded                = true                     
                     idea.launcher.port        = 7533                     
                     user.script               =                          
                     user.country              = US                       
                     sun.java.launcher         = SUN_STANDARD             
                     sun.os.patch.level        =                          
                     java.vm.specification.name = Java Virtual Machine Specification
                     user.dir                   = C:\Users\xxxx\Dropbox\Misc\diagnostic
                     java.runtime.version       = 1.8.0_112-b15            
                     java.awt.graphicsenv       = sun.awt.Win32GraphicsEnvironment
                     java.endorsed.dirs         = C:\Program Files\Java\jdk1.8.0_112\jre\lib\endorsed
                     os.arch                    = amd64                    
                     java.io.tmpdir             = C:\Users\xxxx\AppData\Local\Temp\
                     line.separator             = 
                       
                     java.vm.specification.vendor = Oracle Corporation       
                     user.variant              =                          
                     os.name                   = Windows 10               
                     sun.jnu.encoding          = Cp1252                   
                     jnidispatch.path          = C:\Users\xxxx\AppData\Local\Temp\jna--1364313718\jna5228876863099999384.dll
                     java.library.path         = C:\Program Files\Java\jdk1.8.0_112\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Docker\Docker\Resources\bin;C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\ProgramData\chocolatey\bin;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;C:\Program Files (x86)\Common Files\Acronis\SnapAPI\;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\AMD\ATI.ACE\Core-Static;C:\Users\xxxx\Dropbox\phpstart\bin;C:\Program Files\Java\jre1.8.0_73\bin;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Windows Kits\10\Windows Performance Toolkit\;C:\Program Files (x86)\GtkSharp\2.12\bin;C:\temp\wt\bin;C:\Program Files (x86)\Windows Live\Shared;C:\Program Files (x86)\Skype\Phone\;C:\Program Files\Git\cmd;C:\Go\bin;C:\Ruby23-x64\bin;C:\Ruby23\bin;C:\tools\cygwin;C:\Users\xxxx\AppData\Local\Microsoft\WindowsApps;.
                     java.specification.name   = Java Platform API Specification
                     java.class.version        = 52.0                     
                     sun.management.compiler   = HotSpot 64-Bit Tiered Compilers
                     os.version                = 10.0                     
                     user.home                 = C:\Users\xxxx          
                     user.timezone             =                          
                     java.awt.printerjob       = sun.awt.windows.WPrinterJob
                     java.specification.version = 1.8                      
                     idea.launcher.bin.path    = C:\Program Files (x86)\JetBrains\IntelliJ IDEA 2016.3\bin
                     file.encoding             = UTF-8                    
                     user.name                 = xxxx                   
                     java.class.path           = C:\Program Files\Java\jdk1.8.0_112\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\rt.jar;C:\Users\xxxx\Dropbox\Misc\diagnostic\untitled\core\target\classes;C:\Users\xxxx\.m2\repository\com\github\oshi\oshi-core\3.4.0\oshi-core-3.4.0.jar;C:\Users\xxxx\.m2\repository\net\java\dev\jna\jna-platform\4.2.2\jna-platform-4.2.2.jar;C:\Users\xxxx\.m2\repository\net\java\dev\jna\jna\4.2.2\jna-4.2.2.jar;C:\Users\xxxx\.m2\repository\org\slf4j\slf4j-api\1.7.22\slf4j-api-1.7.22.jar;C:\Users\xxxx\.m2\repository\javax\servlet\javax.servlet-api\3.0.1\javax.servlet-api-3.0.1.jar;C:\Program Files (x86)\JetBrains\IntelliJ IDEA 2016.3\lib\idea_rt.jar
                     java.vm.specification.version = 1.8                      
                     sun.arch.data.model       = 64                       
                     java.home                 = C:\Program Files\Java\jdk1.8.0_112\jre
                     sun.java.command          = com.intellij.rt.execution.application.AppMain com.xxxxwalter.environment.EnvironmentLogger
                     java.specification.vendor = Oracle Corporation       
                     user.language             = en                       
                     awt.toolkit               = sun.awt.windows.WToolkit 
                     java.vm.info              = mixed mode               
                     java.version              = 1.8.0_112                
                     java.ext.dirs             = C:\Program Files\Java\jdk1.8.0_112\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
                     sun.boot.class.path       = C:\Program Files\Java\jdk1.8.0_112\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_112\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_112\jre\classes
                     java.vendor               = Oracle Corporation       
                     file.separator            = \                        
                     java.vendor.url.bug       = http://bugreport.sun.com/bugreport/
                     sun.cpu.endian            = little                   
                     sun.io.unicode.encoding   = UnicodeLittle            
                     sun.desktop               = windows                  
                     sun.cpu.isalist           = amd64                    

XML Parsers
                     SAXParserFactory          = com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl@3551a94
                     TransformerFactory        = com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl@531be3c5
                     DocumentBuilderFactory    = com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl@52af6cff
                     SOAPFactory               = com.sun.xml.internal.messaging.saaj.soap.ver1_2.SOAPFactory1_2Impl@735b478

Specific files
                     any.txt location          = file:/C:/Users/xxxx/any.txt
                     other.txt location        = not found in classpath.  

Class path (top -> down priority)
                     AppClassLoader            = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/charsets.jar
                                               = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/deploy.jar
                                               = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/ext/access-bridge-64.jar
                     ExtClassLoader            = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/ext/access-bridge-64.jar
                                               = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/ext/cldrdata.jar
                                               = file:/C:/Program%20Files/Java/jdk1.8.0_112/jre/lib/ext/dnsns.jar
```

### What will be logged
* Java Runtime settings
* XML parsers, transformer
* Hardware information (thanks to Oshi)
* Files locations of some files from classpath
* System variables (-D jvm arguments)
* Classpath order

A tomcat web listener is provided, use it in web.xml like this

```
    <context-param>
        <description>List of comma separated file read from classpath you want to track.</description>
        <param-name>specificFiles</param-name>
        <param-value>any.txt,other.txt</param-value>
    </context-param>

    <listener>
        <listener-class>com.cedricwalter.environment.EnvironmentListener</listener-class>
    </listener>
```

you can use this code in any POJO

```
EnvironmentLogger environmentLogger = new EnvironmentLogger();
environmentLogger.trackFilenameLocation("any.txt");
environmentLogger.trackFilenameLocation("other.txt");
System.out.println(environmentLogger.getSystemInfo());
```

### Installation
`git clone https://github.com/cedricwalter/SystemInformation4j.git`
`mvn package` and copy/upload to your repository/nexus
