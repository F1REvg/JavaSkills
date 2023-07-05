package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class JsonTest {
    public static void main(String[] args) {
        String jsonka = "{\"mobi-money.mts\":{\"Brand\":\"mts\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"4\"},\"mobi-money.megafon\":{\"Brand\":\"megafon\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"6.3\"},\"mobi-money.beeline\":{\"Brand\":\"beeline\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"7\"},\"mobi-money.tele2\":{\"Brand\":\"tele2\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"5\"},\"mobi-money.utel\":{\"Brand\":\"utel\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"5\"},\"mobi-money.nss\":{\"Brand\":\"nss\",\"FixCom\":\"0\",\"MinCom\":\"0\",\"Percent\":\"5\"},\"mobi-money-card\":{\"FixCom\":\"10\",\"MinCom\":\"0\",\"Percent\":\"2.2\"}}";
        System.out.println(parseDouble(getFieldValue("Percent", jsonka)) / 100);
        System.out.println(parseDouble(getFieldValue("FixCom", jsonka)) / 100);
        System.out.println(parseDouble(getFieldValue("MinCom", jsonka)) / 100);
    }
    private static String getFieldValue(String name, String file) {
        String value = null;
        if(true) {
            file = getMobiMoneyCardCommissionValue(file);
        }
        try {
            value = file.split("[\"<]" + name + "[(\":)>]+")[1].split("\"|(,\"|})|<")[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new RuntimeException("no " + name + " field in response " + file + ", is respone = " + file);
        }
        return value;
    }

    private static String getMobiMoneyCardCommissionValue(String file) {
        String rx = "\"mobi-money-card\":\\{(.*?)\\}";
        Pattern p = Pattern.compile(rx);
        Matcher m = p.matcher(file);
        m.find();
        return m.group(1);
    }
}
