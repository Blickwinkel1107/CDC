package exp.iTrust.diff_parser;

import exp.iTrust.ITrustSetting;
import parser.DiffParser;

/**
 * Created by niejia on 16/2/18.
 */
public class iTrustDiffParser {
    public static void main(String[] args) {
        DiffParser parser = new DiffParser(ITrustSetting.MethodDiff_ChangeV11, ITrustSetting.FieldDiff_ChangeV11, "v11", "v10", "txt");
    }

    public static void diff(String diffMethodFile, String diffFieldFile, String newVersion, String oldVersion, String extendName) {
        DiffParser parser = new DiffParser(diffMethodFile, diffFieldFile, newVersion, oldVersion, extendName);
        System.out.println(parser);
        System.out.println("---------------------- ");
    }
}
