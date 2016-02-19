package exp.Aqualush.diff_parser;

import exp.Aqualush.AqualushSetting;
import parser.DiffParser;

/**
 * Created by niejia on 15/11/29.
 */
public class AqualushDiffParser_Old {
    public static void main(String[] args) {
        String diffFile4 = AqualushSetting.Diff_Change4;
        DiffParser parser4 = new DiffParser(diffFile4, "change4", "change3", "txt");
        System.out.println(parser4);
        System.out.println("---------------------- ");
        String diffFile5 = AqualushSetting.Diff_Change5;
        DiffParser parser5 = new DiffParser(diffFile5, "change5", "change4", "txt");
        System.out.println(parser5);
        System.out.println("---------------------- ");
        String diffFile7 = AqualushSetting.Diff_Change7;
        DiffParser parser7 = new DiffParser(diffFile7, "change7", "change6", "txt");
        System.out.println(parser7);

        String diffFile99 = AqualushSetting.Diff_Change99;
        DiffParser parser99 = new DiffParser(diffFile99 , "change99", "change0", "txt");
        System.out.println(parser99);
    }
}
