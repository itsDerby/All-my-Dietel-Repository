package chapterThree;

class ClockTest {
    public static void main(String[] args) {
        Clock myclock = new Clock(100, 300, 45);
        myclock.setHour(56);
        myclock.setMinute(59);
        myclock.setSecond(59);

        System.out.printf("%d",myclock.getHour());
        System.out.printf(":%d",myclock.getMinute());
        System.out.printf(":%d",myclock.getSecond());


    }

}