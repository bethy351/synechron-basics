package com.synechron.linkedlistimpl;

import lombok.Data;

@Data
public class Node {

	private int data; //will hold the read data
	
	private Node node; // will hold the address of next node
	
}
