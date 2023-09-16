package ChibuzoAssignment;

public class BackToSender {
    public static void main(String[] args) {
        rateValue(59);
    }

        public static int rateValue(int collectionRate){
            int result = 0;
            if (collectionRate < 50) {
                result = collectionRate * 160 + 5000;
                System.out.println(result);
            }
                else if(collectionRate <= 59){
                    result = collectionRate * 200 + 5000;
                    System.out.println(result);
                }
                else if(collectionRate <= 69) {
                result = collectionRate * 250 + 5000;
                System.out.println(result);
                }
                else {
                    result = collectionRate * 500 + 5000;
                    System.out.println(result);
                }

            return result;
        }

        }



