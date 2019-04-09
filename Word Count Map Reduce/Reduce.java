import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, LongWritable, LongWritable, Text>{
protected void reduce(Text key, java.lang.Iterable<LongWritable> values,Context context) 
		throws java.io.IOException ,InterruptedException {
	long sum=0;
	for (LongWritable value : values) {
		sum=sum+value.get();
	
	}
	context.write(new LongWritable(sum),key);
}
}
