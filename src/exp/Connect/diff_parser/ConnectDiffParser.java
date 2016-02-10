package exp.Connect.diff_parser;

import exp.Connect.ConnectSetting;
import parser.MethodBodyDiff;

/**
 * Created by niejia on 15/11/29.
 */
public class ConnectDiffParser {

    public static void main(String[] args) {
        String diffFile841 = ConnectSetting.Diff_Change841;
        MethodBodyDiff parser841 = new MethodBodyDiff(diffFile841, ConnectSetting.Change841_After, ConnectSetting.Change841_Before, "txt");


        String diffFile843 = ConnectSetting.Diff_Change843;
        MethodBodyDiff parser843 = new MethodBodyDiff(diffFile843, ConnectSetting.Change843_After, ConnectSetting.Change843_Before, "txt");

        String diffFile847 = ConnectSetting.Diff_Change847;
        MethodBodyDiff parser847 = new MethodBodyDiff(diffFile847, ConnectSetting.Change847_After, ConnectSetting.Change847_Before, "txt");

//        System.out.println(parser841);
//        System.out.println(parser843);
//        System.out.println(parser847);
        System.out.println("---------------------- ");
    }
}
