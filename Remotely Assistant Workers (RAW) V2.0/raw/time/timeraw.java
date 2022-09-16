package raw.time;

import java.io.File; 
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import java.net.*;
import java.io.*; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class timeraw
{
		private static final String dformat = "dd/MM/yyyy, EEEEEE, MMMM, HH:mm:ss:SSS, zzzzzzzz:Z";
public static String intime() {
	Calendar date=Calendar.getInstance();
			SimpleDateFormat df = new SimpleDateFormat(dformat);
		String d=df.format(date.getTime());

		return d;
	}
	
	
	public String timelockh(int a) {
	Calendar date=Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(dformat);
		int hour = a;
		String d=df.format(date.getTime());
		
		Calendar startTime = date;
		startTime.add(date.HOUR, hour);
		String cdate = df.format(startTime.getTime());
		

		return cdate;
	}
public String timelockd(int a) {
	Calendar date=Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat(dformat);
		int hour = (a*24);
		String d=df.format(date.getTime());
		
		Calendar startTime = date;
		startTime.add(date.HOUR, hour);
		String cdate = df.format(startTime.getTime());
		
	
		return cdate;
	}
	
	public static int datechecker(String a, String b)throws ParseException
	{
		
      /*
	  
	     if (a.compareTo(b) > 0) {
            //System.out.println("Date1 is after Date2");
			
        }  if (a.compareTo(b) < 0) {
            //System.out.println("Date1 is before Date2");
				return 1;
        }  if (a.compareTo(b) == 0) {
            //System.out.println("Date1 is equal to Date2");
			return 0;
        } */
        SimpleDateFormat sdf = new SimpleDateFormat(dformat);
        Date date1 = sdf.parse(a);
        Date date2 = sdf.parse(b);

        /*System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));
*/
        if (date1.after(date2)) {
            //System.out.println("Date1 is after Date2");
			return 0;
        }

        if (date1.before(date2)) {
            //System.out.println("Date1 is before Date2");
			return 1;
        }

        if (date1.equals(date2)) {
            //System.out.println("Date1 is equal Date2");
			return 0;
        }
	  
		return 1;
	}

public String agefinder(String bdate, String bmonth, String byear)
{
	int d=Integer.parseInt(bdate);
	if(bmonth.equals("January"))
	{
		bmonth="1";
	}
	if(bmonth.equals("February"))
	{
		bmonth="2";
	}
	if(bmonth.equals("March"))
	{
		bmonth="3";
	}
	if(bmonth.equals("April"))
	{
		bmonth="4";
	}
	if(bmonth.equals("May"))
	{
		bmonth="5";
	}
	if(bmonth.equals("June"))
	{
		bmonth="6";
	}
	if(bmonth.equals("July"))
	{
		bmonth="7";
	}
	if(bmonth.equals("August"))
	{
		bmonth="8";
	}
	if(bmonth.equals("September"))
	{
		bmonth="9";
	}
	if(bmonth.equals("October"))
	{
		bmonth="10";
	}
	if(bmonth.equals("November"))
	{
		bmonth="11";
	}
	if(bmonth.equals("December"))
	{
		bmonth="12";
	}
	int m=Integer.parseInt(bmonth);
	int y=Integer.parseInt(byear);
	

	
  LocalDate l = LocalDate.of(y, m, d); //specify year, month, date directly
  LocalDate now = LocalDate.now(); //gets localDate
  Period diff = Period.between(l, now); //difference between the dates is calculated
  return(diff.getYears() + " Years, " + diff.getMonths() + " Months, " + diff.getDays() + " Days.");
}


	
}