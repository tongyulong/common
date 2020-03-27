package com.tyl.common.utils;

import java.util.Date;

public class DateUtil {

	public static Date randomDate(Date start,Date end){
		
		long t1 = start.getTime();
		long t2 = end.getTime();
		
		if(t2<t1)
		throw new RuntimeException("开始日期不能大于结束日期");
			
		long t = (long)((Math.random()*(t2-t1))+t1);
		
		return new Date(t);
	}
}
