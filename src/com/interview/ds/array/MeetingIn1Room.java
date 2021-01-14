package com.interview.ds.array;

import java.util.ArrayList;
import java.util.Collections;

public class MeetingIn1Room {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case 1 --------------------");
		int n = 6;
		int [] start = {1 , 0 , 3 , 8 , 5 , 8};
		int [] end =   {2 , 6 , 4 , 9 , 7 , 9};
		
		maxMeetings(start, end, n);

	}

	
	public static void maxMeetings(int [] start , int [] end , int n) {
		ArrayList<Meeting> meetings = new ArrayList();
		for(int i = 0 ; i < n ; i++) {
			meetings.add(new Meeting(start[i], end[i], i+1));
		}
		Collections.sort(meetings, (p1, p2) -> {
	         return p1.end - p2.end; 
	      }); 
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		answer.add(meetings.get(0).meetingNo);
		int finish = meetings.get(0).end;
		
		for(int i = 1 ; i < n ; i++) {
			Meeting meeting = meetings.get(i);
			if(finish < meeting.start) {
				answer.add(meeting.meetingNo);
				finish = meeting.end;
			}
		}
		
		System.out.println("Total Number of Meetings Held "+answer.size());
		for(int i = 0 ; i < answer.size() ; i++) {
			System.out.print(answer.get(i)+" ");
		}
	}
	
	static class Meeting {
		int start;
		int end ;
		int meetingNo;
		
		public Meeting(int start, int end, int meetingNo) {
			super();
			this.start = start;
			this.end = end;
			this.meetingNo = meetingNo;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		public int getMeetingNo() {
			return meetingNo;
		}

		public void setMeetingNo(int meetingNo) {
			this.meetingNo = meetingNo;
		}
		
		
	}
	
}
