package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class PatternPractice {
    public static void main(String[] args) {
        String charge = "{\"doc_date\":\"05.10.2022\",\"doc_no\":\"64173\\/17\\/24017-\\u0410\\u041f\",\"to_pay\":\"435.50\",\"amount\":\"435.50\",\"pay_purpose\":\"\\u0428\\u0442\\u0440\\u0430\\u0444 \\u0413\\u0418\\u0411\\u0414\\u0414\",\"gisgmp_billfor\":\"\\u041e\\u043f\\u043b\\u0430\\u0442\\u0430 \\u0434\\u043e\\u043b\\u0433\\u0430 \\u043f\\u043e \\u0410\\u041f \\u2116 64173\\/17\\/24017-\\u0410\\u041f \\u043e\\u0442 22.02.2022 \\u0432 \\u043e\\u0442\\u043d\\u043e\\u0448\\u0435\\u043d\\u0438\\u0438 \\u041c\\u0415\\u041b\\u042c\\u041d\\u0418\\u041a\\u041e\\u0412\\u041e\\u0419 \\u0410. \\u0410., \\u0428\\u0442\\u0440\\u0430\\u0444 \\u0413\\u0418\\u0411\\u0414\\u0414\\/\\/\\/\\u0423\\u0418\\u041d32224017170064173008;\\u0410\\u041f0\",\"corr_account\":\"\",\"account\":\"40302810100001000018\",\"kbk\":\"32200000000000000000\",\"inn\":\"2466124527\",\"kpp\":\"246145004\",\"bik\":\"040407001\",\"okato\":\"04701000\",\"payee_name\":\"\\u041e\\u0421\\u041f \\u043f\\u043e \\u0412\\u0410\\u0428 \\u043f\\u043e \\u0433. \\u041a\\u0440\\u0430\\u0441\\u043d\\u043e\\u044f\\u0440\\u0441\\u043a\\u0443 \\u0438 \\u0415\\u043c\\u0435\\u043b\\u044c\\u044f\\u043d\\u043e\\u0432\\u0441\\u043a\\u043e\\u043c\\u0443 \\u0440\\u0430\\u0439\\u043e\\u043d\\u0443\",\"bank_name\":\"\\u041e\\u0422\\u0414\\u0415\\u041b\\u0415\\u041d\\u0418\\u0415 \\u041a\\u0420\\u0410\\u0421\\u041d\\u041e\\u042f\\u0420\\u0421\\u041a\",\"unifo_id\":\"32224017170064173008\",\"payeridentifier\":\"2100000000691105783996643\",\"tax_status\":\"24\",\"tax_purpose\":\"0\",\"tax_period\":\"0\",\"tax_docno\":\"0\",\"tax_docdate\":\"0\",\"tax_paytype\":\"\",\"payer_name\":\"\",\"type\":\"ufssp\",\"payer_inn\":\"691105783996\",\"region\":23,\"region_name\":\"\\u041a\\u0440\\u0430\\u0441\\u043d\\u043e\\u044f\\u0440\\u0441\\u043a\\u0438\\u0439 \\u043a\\u0440\\u0430\\u0439\",\"department\":\"24017\",\"department_name\":\"\\u041e\\u0421\\u041f \\u043f\\u043e \\u0412\\u0410\\u0428 \\u043f\\u043e \\u0433. \\u041a\\u0440\\u0430\\u0441\\u043d\\u043e\\u044f\\u0440\\u0441\\u043a\\u0443 \\u0438 \\u0415\\u043c\\u0435\\u043b\\u044c\\u044f\\u043d\\u043e\\u0432\\u0441\\u043a\\u043e\\u043c\\u0443 \\u0440\\u0430\\u0439\\u043e\\u043d\\u0443\",\"billid\":\"32224017170064173008\",\"charge_amount\":\"435.50\",\"chargePrefix\":\"ap\",\"payer_fio\":\"\\u041c\\u0415\\u041b\\u042c\\u041d\\u0418\\u041a\\u041e\\u0412\\u0410 \\u0410\\u041d\\u0410\\u0421\\u0422\\u0410\\u0421\\u0418\\u042f \\u0410\\u041d\\u0410\\u0422\\u041e\\u041b\\u042c\\u0415\\u0412\\u041d\\u0410\",\"primalDocument\":\"\\u0428\\u0442\\u0440\\u0430\\u0444 \\u0413\\u0418\\u0411\\u0414\\u0414, \\u043f\\u043e\\u0441\\u0442\\u0430\\u043d\\u043e\\u0432\\u043b\\u0435\\u043d\\u0438\\u0435 \\u2116 18810150160224747186 \\u043e\\u0442 2016-02-24\",\"hash_code\":\"7ea7986ab0fd0dd3c066232320ca8e91\"}";
        String amount = parseDouble("1 700".replaceAll(" ", "")) + "0";
        Pattern p = Pattern.compile("\"amount\":\"(.*?)\"");
        Matcher m = p.matcher(charge);
        m.find();
        String oldAmount = m.group(1);
        String newCharge = charge.replaceAll("amount\":\"" + oldAmount, "amount\":\"" + amount);
        System.out.println(newCharge);
    }
}
