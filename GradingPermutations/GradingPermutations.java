package permutations;

import java.util.*;

public class GradingPermutations {
	private static HashMap<String, Integer> TeachingAssistantsAssignment = new HashMap<String, Integer>();
	
	/**
	 * Assign group number to TAs
	 * 27 students per 10 hour TA, 36 per 20 hour TA
	 */
	private static void AssignGroup() {
		Random rand = new Random();
		PriorityQueue<String> TA = new PriorityQueue();
		//Add every TA to the PQ, ** means they are a 20 hour TA
		TA.add("Kamsi");
		TA.add("Prajjawal**");
		TA.add("Andrew");
		TA.add("Katelyn");
		TA.add("Xiaoqian**");
		TA.add("Jacob");
		TA.add("Matthew");
		TA.add("Walter");
		TA.add("James");
		TA.add("Yifei");
		TA.add("Yuechuan");
		while(!TA.isEmpty()) {
			String chosenTA = TA.poll();	//Extract the first TA
			while(true) { //Assign a random number between 1 and the number of TAs to every TA
				int groupNumber = rand.nextInt(11) + 1;
				if (!TeachingAssistantsAssignment.containsValue(groupNumber)) { //Make sure the group number hasn't been assigned yet
					TeachingAssistantsAssignment.put(chosenTA, groupNumber); //Assign that group number
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AssignGroup();	//Assign groups to the TAs
		
		//Iterate through the hashmap and print out the results
		Set set = TeachingAssistantsAssignment.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	    		Map.Entry mentry = (Map.Entry)iterator.next();
	        System.out.println("TA: "+ mentry.getKey() + " 	Group Number: " + mentry.getValue());
	    }
	}
	
}
