import java.io.IOException;
// import gen.*;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.*;

public class PPMain {

	public static void main(String[] args) throws IOException {

		ANTLRFileStream input = new ANTLRFileStream("../inputs/hello.cpp");
		cppLexer lexer = new cppLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		cppParser parser = new cppParser(tokens);

		ParseTree tree = parser.translationunit(); // entry point
		PPListener listener = new PPListener();
		ParseTreeWalker.DEFAULT.walk(listener, tree);

    }
}