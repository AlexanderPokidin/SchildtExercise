package packageIO.helpFile;

public class FileHelp {
    public static void main(String[] args) {
        Help helpObj = new Help("helpfile");
        String topic;

        System.out.println("Bocпoльэyйтecь справочной системой.\n"
                + "Для выхода из системы введите 'stop'.");

        do {
            topic = helpObj.getSelection();
            if (!helpObj.helpon(topic)) {
                System.out.println("Teмa не найдена.\n");
            }
        } while (topic.compareTo("stop") != 0);
    }
}
