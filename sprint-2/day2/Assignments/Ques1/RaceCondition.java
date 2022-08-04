package sprint2Day2.Assignments.Ques1;

import java.time.LocalDate;

/*
 * Race Condition:
 * Race condition occurs when two or more Threads compete to get some shared resources. These rescouces 
 * can be variables, methods, objects etc. When two or more Threads are working on same resources, at the same time,
 * it is called "concurrency", thus leading to "data inconsistency".
 * To solve this problem, we have "synchronization" method which allows only one Thread to enter the 
 * critical section (section, where the race-condition may occur) at a single time.
 * Below is the example given for the same:
 * 
 */

public class RaceCondition {

	public static void main(String[] args) {
		UnsynchronizedShared us= new UnsynchronizedShared();
		synchronizedShared ss= new synchronizedShared();
		
		LocalDate ld1=LocalDate.parse("1997-08-15");
		LocalDate ld2=LocalDate.parse("2000-08-10");
		ThreadA a= new ThreadA(us,ld1);
		ThreadB b=new ThreadB(us,ld2);
//		a.start();
//		b.start();
		
		
		
		ThreadA2 a2= new ThreadA2(ss,ld1);
		ThreadB2 b2=new ThreadB2(ss,ld2);
		a2.start();
		b2.start();
	}
}

class UnsynchronizedShared{
	public void fun1(LocalDate l) {
		System.out.println("i am non-crirtical from UnsynchronizedShared");
		
		System.out.println("My age in the current year is:");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDate ld= LocalDate.now();
		System.out.println(ld.compareTo(l));
		
		System.out.println("i am non-crirtical");
		
	}
}
class ThreadA extends Thread{
	UnsynchronizedShared c;
	LocalDate ldate;
	public ThreadA(UnsynchronizedShared c, LocalDate ldate) {
		super();
		this.c = c;
		this.ldate = ldate;
	}
	
	@Override
	public void run() {
		c.fun1(ldate);
	}
	
}


class ThreadB extends Thread{
	UnsynchronizedShared c;
	LocalDate ldate;
	public ThreadB(UnsynchronizedShared c, LocalDate ldate) {
		super();
		this.c = c;
		this.ldate = ldate;
	}
	
	@Override
	public void run() {
		c.fun1(ldate);
	}
}


class synchronizedShared{
	public synchronized void fun1(LocalDate l) {
		System.out.println("i am non-crirtical from synchronizedShared");
		
		synchronized (this) {
			System.out.println("My age in the current year is:");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LocalDate ld= LocalDate.now();
			System.out.println(ld.compareTo(l));
		}
		
		System.out.println("i am non-crirtical");
		
	}
}

class ThreadA2 extends Thread{
	synchronizedShared c;
	LocalDate ldate;
	public ThreadA2(synchronizedShared c, LocalDate ldate) {
		super();
		this.c = c;
		this.ldate = ldate;
	}
	
	@Override
	public void run() {
		c.fun1(ldate);
	}
	
}


class ThreadB2 extends Thread{
	synchronizedShared c;
	LocalDate ldate;
	public ThreadB2(synchronizedShared c, LocalDate ldate) {
		super();
		this.c = c;
		this.ldate = ldate;
	}
	
	@Override
	public void run() {
		c.fun1(ldate);
	}
}
