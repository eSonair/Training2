package Training2;

public class Friedhof {

    /*
    LinkedNode
     ListNode lN = new ListNode(elements[0]);
        this.root =lN;

        for (int i=1; i<elements.length;i++){
            if(i<elements.length-1){

                ListNode name = new ListNode(elements[i]);
                name.next=new ListNode(elements[i+1]);
            }
            else{
                ListNode name = new ListNode(elements[i]);
            }

        }

     */




    /*
    IsomorphicStrings

    System.out.println("a:" + (int) 'a');
    System.out.println("z:" + (int) 'z');   //122
    System.out.println("A:" + (int) 'A');   //65
    System.out.println("Z:" + (int) 'Z');





     */












    /*
    HappyNumber

        int digitCheck=10, ct=0, result=0;
        String nr;

        n=19;

        nr=""+n;
        ct=nr.length();

        System.out.println(ct);



            //Safety check
            for (int i=0; i<nrCache.size();i++){
                System.out.println("Vor Nach 2: " + nrCache.get(i));
            }

            //Safety check
           for (int i=0; i<nrCache.size();i++){
                System.out.println("Nach Hoch 2: " + nrCache.get(i));
            }



             public void transferElements (List <Integer> x,List <Integer> y){
        for (int a: x){
            y.add(a);
        }
    }

     */



    /*
    Training2.MajorityElement.MajorityElement


     //Check
        /*
        for (int a:nums){
            System.out.println(a);
        }
        //System.out.println("Nummer:" + nums[i]);
            System.out.println("maxNr: " + maxNr);
            if(maxNr==nums[i]){
                maxCt++;
                System.out.println("maxCT: " +maxCt);
                System.out.println();
            }
            else if(maxNr!=nums[i] || i==nums.length-1){            //greedy
                if(actCt>maxCt){
                    maxNr=nums[i];
                    maxCt=actCt;
                    actCt=0;

                }else
                    actCt=0;
            }


             //System.out.println("maxNr: " + maxNr);

     */






    /*

        if(nr>9){
            nr=nr/10;   //10:10=1;
            nr1=nr%nr;  //10%10=0;
            for(int i=0; i< digits.length-1;i++){
                plusOne[i]=digits[i];
            }
            plusOne[plusOne.length-2]=nr;
            plusOne[plusOne.length-1]=nr1;
        }
        else {
            //digits={1,2,3};
            plusOne= new int[digits.length];

            for(int i=0; i< digits.length-1;i++){
                plusOne[i]=digits[i];
            }
            plusOne[plusOne.length-1]=nr;
        }

     */
}
