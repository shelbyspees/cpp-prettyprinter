import gen.*;

import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.antlr.v4.runtime.ParserRuleContext;


public class PPListener extends cppBaseListener {

	STGroup g = new STGroupFile("PrettyPrint.stg");


    @Override 
    public void exitTranslationunit(cppParser.TranslationunitContext ctx) {
        System.out.println("abc");
    }


}