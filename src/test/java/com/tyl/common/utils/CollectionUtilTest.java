package com.tyl.common.utils;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		boolean b = CollectionUtil.isEmpty(null);
		System.out.println(b);
	}

}
