import javax.swing.JOptionPane;
public class WeatherApp {
    public static void main(String[] args) {
        int weather;
        int age ;

        weather = getWeather();
        while(weather != 0){
            if (weather>=1 && weather<=3){
                age = getAge();
                showActivity(weather,age);
            } else {
                JOptionPane.showMessageDialog(null,"Invalid Weather menu... \nTry again!!!");

            }
            weather = getWeather();
        }
        JOptionPane.showMessageDialog(null,"+++++ Bye bye!! +++++");
    }

    public static int getWeather(){
        int weather = Integer.parseInt(JOptionPane.showInputDialog("" +
                "+++ Weather Program ++++\n" +
                "1. Rainy day\n" +
                "2. Sunny day\n" +
                "3. Snowy day\n\n" +
                "Enter weather menu(1-3) or 0 to exit program : "));

        return weather;
    }

    public static int getAge(){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        return age;
    };

    public static void showActivity(int weather , int age){
        String activity = "";

        switch (weather){
            case 1 :
            if (age>=20 && age<=60){
                activity = "Please take an umbrella when go work.";
            }else{
                activity = "Take care of you.";
            }
                break;
            case 2 :
            if(age<=18){
                activity = "Enjoy swimming";
            }else if (age>=18 && age<=25){
                activity = "Let's play bleach volleyball";
            }else{
                activity = "Enjoy lading under the sun";
            }
                break;
            case 3 :
                if(age<=16){
                    activity = "Let's make an snowman";
                }else if (age>=16 && age<=45){
                    activity = "Let's clean a snow on the road";
                }else{
                    activity = "Let's watching a snow fall beside the window";
                }
                break;
        }
        JOptionPane.showMessageDialog(null,"" + activity);
    }
}
