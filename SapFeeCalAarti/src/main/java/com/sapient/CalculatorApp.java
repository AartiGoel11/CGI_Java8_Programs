package com.sapient;

import java.io.IOException;
import java.util.List;

import com.sapient.FeeCalculator;
import com.sapient.Transaction;
import com.sapient.TransactionReader;
import com.sapient.Constant.FILE_TYPE;

/**
 * Hello world!
 *
 */
public class CalculatorApp 
{
    public static void main( String[] args ) throws IOException
    {
    	List<Transaction> transactions = TransactionReader.readFile(FILE_TYPE.TEXT, "sampleData.txt");
        FeeCalculator calculator = new FeeCalculator();
        calculator.addTransaction(transactions);
        calculator.displayTransactionReport();
    }
}
