package com.importsource.conf;

import org.junit.Test;

public class PropertiesTest {
	@Test
	public void testGet() {
		Properties p = Properties.newInstance("wc.xml");
		String dir=p.get("hadoop.tmp.dir",null);
		System.out.println(dir);
	}
}
