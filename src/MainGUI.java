import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hudoassenco on 12/6/15.
 */
public class MainGUI {

    private JButton mAnalyseButton;
    private JPanel mPanel;
    private JComboBox mStockComboBox;
    private JTextField mStartDateTextField;
    private JTextField mEndDateTextField;
    private JComboBox mStockMarketComboBox;

    private AnalysisAbstractFactory mAnalysisAbstractFactory;
    private StockContext mStockContext;

    public MainGUI() {
        mAnalysisAbstractFactory = new TrendingFactory();
        mStockContext = (StockContext) mAnalysisAbstractFactory.createAnyContext();

        mStockMarketComboBox.setModel(new DefaultComboBoxModel(mStockContext.getTypes().toArray()));
        mStockMarketComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StockMarket market = (StockMarket) mStockMarketComboBox.getSelectedItem();
                mStockComboBox.setModel(new DefaultComboBoxModel(market.getEntities().toArray()));
            }
        });
        mAnalyseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}
