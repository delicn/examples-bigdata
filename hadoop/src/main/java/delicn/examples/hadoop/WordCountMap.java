package delicn.examples.hadoop;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * @author: deli
 */
public class WordCountMap extends Mapper<LongWritable, Text, Text, IntWritable> {


}
