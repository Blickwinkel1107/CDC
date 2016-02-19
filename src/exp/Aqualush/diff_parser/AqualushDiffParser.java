package exp.Aqualush.diff_parser;

import exp.Aqualush.AqualushSetting;
import parser.DiffParser;

/**
 * Created by niejia on 16/2/10.
 */
public class AqualushDiffParser {

    public static void main(String[] args) {
        DiffParser parser4 = new DiffParser(AqualushSetting.MethodDiff_Change4, AqualushSetting.FieldDiff_Change4, "change4", "change3", "txt");
        DiffParser parser5 = new DiffParser(AqualushSetting.MethodDiff_Change5, AqualushSetting.FieldDiff_Change5, "change5", "change4", "txt");
        DiffParser parser6 = new DiffParser(AqualushSetting.MethodDiff_Change7, AqualushSetting.FieldDiff_Change7, "change7", "change6", "txt");
        DiffParser parser99 = new DiffParser(AqualushSetting.MethodDiff_Change99, AqualushSetting.FieldDiff_Change99, "change99", "change0", "txt");
    }

    public static void diff(String diffMethodFile, String diffFieldFile, String newVersion, String oldVersion, String extendName) {
        DiffParser parser = new DiffParser(diffMethodFile, diffFieldFile, newVersion, oldVersion, extendName);
        System.out.println(parser);
        System.out.println("---------------------- ");
    }
}
