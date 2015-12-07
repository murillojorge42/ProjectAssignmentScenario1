import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class TextFileMedia extends AnyMedia {

    private String mFileName;
    private final DateFormat mDF = new SimpleDateFormat("MM/dd/yyyy");


    @Override
    public void saveForm(AnyForm form) {
        List<String> lines = new ArrayList<String>();
        TrendingReport trendingReport = (TrendingReport) form;
        
        try {
            FileWriter fileWriter = new FileWriter(mFileName);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("=====================================");
            bufferedWriter.newLine();
            bufferedWriter.write("Trending report for Stock: " + trendingReport.getStock().getCode());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Longest Up Trend: from " + mDF.format(trendingReport.getLongestUpStartDate())
                    + " to " + mDF.format(trendingReport.getLongestUpEndDate()));
            bufferedWriter.newLine();
            bufferedWriter.write("Current trend Start: " + mDF.format(trendingReport.getCurrentTrendStart()));
            bufferedWriter.newLine();
            bufferedWriter.write("Current trend coefficient: " + trendingReport.getCurrentTrendCoefficient());
            bufferedWriter.newLine();
            bufferedWriter.write("=====================================");

            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
