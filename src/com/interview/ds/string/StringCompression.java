package com.interview.ds.string;

public class StringCompression {

	public static void main(String[] args) {
		String str = "COORRRKITTTAAASS";
		System.out.println("Compressed String Of String : "+str +" is "+compressString(str));
		str = "MMMUUNNAASSS";
		System.out.println("Compressed String Of String : "+str +" is "+compressString(str));
	}

	private static String compressString(String str) {
	StringBuilder compressedSb = new StringBuilder();
	
	for(int i = 0 ; i < str.length() ;) {
		char c = str.charAt(i);
		compressedSb.append(c);
		int count = 1;
		i++;
		while(i < str.length() && str.charAt(i) == c) {
			i++;
			count++;
		}
		compressedSb.append(count);
	}
	
	return compressedSb.toString();
	
	}

}
/*Compressed String Of String : COORRRKITTTAAASS is C1O2R3K1I1T3A3S2
Compressed String Of String : MMMUUNNAASSS is M3U2N2A2S3
*/