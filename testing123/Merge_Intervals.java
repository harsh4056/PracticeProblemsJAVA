package testing123;

import java.util.ArrayList;
import testing123.Interval;
public class Merge_Intervals {


public static void main(String[] args) {
	
	Interval Inter= new Interval(16197462, 108785977);
	ArrayList<Interval> listEle= new ArrayList<Interval>();

	listEle.add(new Interval(137207, 1734370));listEle.add(new Interval(5057723, 5365773));listEle.add(new Interval(6997657, 7282669));listEle.add(new Interval(7992707, 8945780));listEle.add(new Interval(13205169, 13286380));listEle.add(new Interval(13478080, 14361199));listEle.add(new Interval(14648047, 16875188));listEle.add(new Interval(17296166, 19089625));listEle.add(new Interval(20424412, 20617334));listEle.add(new Interval(21947854, 23077086));listEle.add(new Interval(24901000, 26346402));listEle.add(new Interval(26650724, 27196856));listEle.add(new Interval(28896156, 29975691));listEle.add(new Interval(30071726, 31373629));listEle.add(new Interval(32397799, 33159528));listEle.add(new Interval(33305337, 35470848));listEle.add(new Interval(35720431, 37452993));listEle.add(new Interval(39147629, 40818780));listEle.add(new Interval(40930468, 41652526));listEle.add(new Interval(41938404, 44430212));listEle.add(new Interval(48114813, 48611161));listEle.add(new Interval(50335149, 51023917));listEle.add(new Interval(51878891, 52987379));listEle.add(new Interval(53902725, 54359910));listEle.add(new Interval(56661881, 58671175));listEle.add(new Interval(59326619, 61927945));listEle.add(new Interval(63215257, 63817507));listEle.add(new Interval(64968095, 65653303));listEle.add(new Interval(66634969, 67941460));listEle.add(new Interval(69980615, 71436951));listEle.add(new Interval(71564309, 74681566));listEle.add(new Interval(75530199, 76592769));listEle.add(new Interval(76988511, 77454928));listEle.add(new Interval(77665838, 78087358));listEle.add(new Interval(78229841, 79535243));listEle.add(new Interval(81250676, 82624050));listEle.add(new Interval(83142364, 84255671));listEle.add(new Interval(84379892, 84668384));listEle.add(new Interval(84954893, 85392199));listEle.add(new Interval(87804458, 90457067));listEle.add(new Interval(90760520, 91607160));listEle.add(new Interval(92361716, 92692045));listEle.add(new Interval(95399553, 97983139));listEle.add(new Interval(99776803, 99818745));
	
	
   
	
	insert(listEle, Inter);
}

public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	  int end=newInterval.end,start=newInterval.start;
      
      if(newInterval.end<newInterval.start){
          start=newInterval.end;
          end= newInterval.start;
      }
      
 		ArrayList<Integer> anotherList= new ArrayList<Integer>();
	ArrayList<Integer> list= new ArrayList<Integer>();
	if(!intervals.isEmpty()){
	for(int i=0;i<intervals.size();i++){
		list.add(intervals.get(i).start);
		list.add(intervals.get(i).end);	
	}
	
	int count=0;boolean cond=true;
	for(int i=0;i<list.size();i++){
		
		if(list.get(i)<=start && list.get(i)<end  ){
			anotherList.add(list.get(i));
			count++;
		}
		else if(list.get(i)>=end &&cond){
			cond=false;
			int parity =count+(list.size()-i);
			if(list.get(i)==end){
			
			if(parity%2==0)
			{
				anotherList.add(list.get(i));
			
			}
			}
			else if (list.get(i)>end){
				if(parity%2==0)
				{
					anotherList.add(list.get(i));
				
				}
				else{
					anotherList.add(end);
					anotherList.add(list.get(i));
				}
				
			}
			
			
			
		}
		else if(list.get(i)>end){
			anotherList.add(list.get(i));
		}
		
		
		
		
	}
	if(anotherList.isEmpty()){
	    anotherList.add(start);
		anotherList.add(end);
	}
	else{
	int lastEle= anotherList.get(anotherList.size()-1);
	if(lastEle<end && lastEle<start && anotherList.size()%2==0){
		anotherList.add(start);
		anotherList.add(end);
		
	}
	else if(lastEle<end && lastEle<start && anotherList.size()%2==1){
		anotherList.add(end);
	}
	
	}
	
	}
	
	else{
		anotherList.add(start);
		anotherList.add(end);
	}
	
	
	intervals.clear();
	for(int i=0;i<anotherList.size();i=i+2){
		intervals.add(new Interval(anotherList.get(i),anotherList.get(i+1)));
		
		
	}
	
	
	return intervals;
    
    

}

}
