/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;


public class Thread1 extends Thread {

    
    public static void main(String[] args) {
        
     Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread();
        thread1 .start();
        thread2.start();
        thread1.run();
        thread2.run();
    }
     public void Synchronisedrun()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
        }
    }
    
}
