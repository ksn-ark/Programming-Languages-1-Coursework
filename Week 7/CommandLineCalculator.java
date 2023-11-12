class CommandLineCalculator {
    public static void main(String [] args) {
        int characters = args.length;

        if (characters < 3) 
            System.out.println("You did not type in a calculation!");
        else if (characters % 2 == 0)
            System.out.println("Invalid number of command line parameters.");
        else {
            Calculator counter = new Calculator();
            counter.count(args);
        }
    }
}
class Calculator {

    /*int[] numberArray;
    String[] operationsArray;

    public void count(String[] args) {
        for(int i=0;i<args.length;i+=2) {
            numberArray[i/2] = Integer.parseInt(args[i]);
        }
        for(int i=1;i<args.length;i+=2) {
            operationsArray[(i/2)+1] = args[i] 
        }

    }*/

    String[] inputArray;

    public void count(String[] inputArray) {

        int output = 0;
        String inputString="";

		for(int i=0;i<inputArray.length;i++) {
			inputString+=inputArray[i];
			if (i==inputArray.length) {
				break;
			}
			inputString+=" ";
		}

        for(int i=0;i<inputArray.length;i+=2) {
            int a = Integer.parseInt(inputArray[i]);
            if(i==0) {
                output=a;
                continue;
            }
            if(inputArray[i-1].equals("+")) {
                output+=a;
            }
            if(inputArray[i-1].equals("-")) {
                output-=a;
            }
        }
        
        System.out.println("Result of the calculation "+ inputString + " is " + output);
    }
}
