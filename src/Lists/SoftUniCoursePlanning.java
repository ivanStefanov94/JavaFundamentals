package Lists;

import java.util.*;
import java.util.stream.Collectors;



public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <String> schedule = Arrays.stream (scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("course start")){

            String [] inputArray = input.split(":");

            if(inputArray[0].equals("Add")){
                if(!schedule.contains(inputArray[1])){
                    schedule.add(inputArray[1]);
                }
            }else if (inputArray[0].equals("Insert")){
                if (!schedule.contains(inputArray[1])){
                    int index = Integer.parseInt(inputArray[2]);
                    schedule.add(index, inputArray[1]);
                }
            }else if((inputArray[0].equals("Remove"))){
                    schedule.remove(inputArray[1]);

            }
             else if (inputArray[0].equals("Exercise")){
                int indexLesson = schedule.indexOf(inputArray[1]);
                if(!schedule.contains(inputArray[1])){
                    schedule.add(inputArray[1]);
                    schedule.add(inputArray[1] + "-Exercise");
                }
                else if (!schedule.contains(inputArray[1] + "-Exercise")){
                    schedule.add(indexLesson+1, inputArray[1] + "-Exercise");

                }
            }else if ((inputArray[0].equals("Swap"))){
                if (schedule.contains(inputArray[1]) && schedule.contains(inputArray[2])){
                    int indexLesson1 = schedule.indexOf(inputArray[1]);
                    int indexLesson2 = schedule.indexOf(inputArray[2]);

                    Collections.swap(schedule, indexLesson1, indexLesson2);

                    //not working
                    if( schedule.get(indexLesson1 + 1).equals(inputArray[1]+"-Exercise")){
                        schedule.add(indexLesson2 + 1, inputArray[1]+"-Exercise" );

                        if (indexLesson2 != schedule.size()-1 && schedule.get(indexLesson2 + 1).equals(inputArray[2]+"-Exercise")){
                            schedule.add(indexLesson1 + 1, inputArray[2]+"-Exercise" );
                        }
                    }
                }
                }
            input = scan.nextLine();
             }

        int counter = 1;
        for (String s : schedule) {
            System.out.println(counter + "." + s );
            counter++;
        }
        }
    }

