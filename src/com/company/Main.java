package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	String host = "whois.ripe.net";
	int port = 53;

	System.out.println(TCPWorker.tcpCheck(host, port));
    }
}
