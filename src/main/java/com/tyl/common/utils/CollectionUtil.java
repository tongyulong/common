package com.tyl.common.utils;

import java.util.Collection;

public class CollectionUtil {

	public static boolean isEmpty(Collection<?> collection){	
		
		return collection==null || collection.isEmpty();	
	}
}
