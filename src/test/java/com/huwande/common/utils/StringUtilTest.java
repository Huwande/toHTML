package com.huwande.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test() {
		StringUtil util = new StringUtil();
		util.toHtml("17600023513");
		
		System.out.println(util);
	}

}
