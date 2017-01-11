package com.pulan.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Strings2listUtil {
    public static List<String> Strings2list(String[] args){
    	 List<String> list = new ArrayList<String>();
    	 for(int i=0;i<args.length;i++){
    		 list.add(args[i]);
    	 }
    	 return Distinct(list);
    }
    public static List<String> Distinct(List<String> strs){
    	Set<String> set = new HashSet<String>();
    	List<String> list = new ArrayList<String>();
    	set.addAll(strs);
    	list.addAll(set);
    	return list;
    }
}
