package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.transform.TransformerFactory;
import java.util.Set;
import java.util.TreeSet;

public class XMLParserPlugin implements EnvironmentPlugin {

    public Set<Tuple> getProperties() {
        Set<Tuple> set = new TreeSet();

        set.add(new Tuple("SAXParserFactory", SAXParserFactory.newInstance().toString()));
        set.add(new Tuple("TransformerFactory", TransformerFactory.newInstance().toString()));
        set.add(new Tuple("DocumentBuilderFactory", DocumentBuilderFactory.newInstance().toString()));
        try {
            set.add(new Tuple("SOAPFactory", SOAPFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL).toString()));
        } catch (SOAPException e1) {
            set.add(new Tuple("SOAPFactory", "Error in creating SOAP factory"));
        }
        return set;
    }

    public String getTitle() {
        return "XML Parsers";
    }

}
