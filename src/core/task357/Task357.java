package core.task357;

public class Task357 {

	public static void main(String[] args) {
    System.out.println("hallo");
	}
	
	public Label checkLabels(TextAnalyzer[] analyzers, String text) {
			for (TextAnalyzer textAnalyzer : analyzers) 
					if(textAnalyzer.processText(text) != Label.OK)
							return textAnalyzer.processText(text);
		return Label.OK;
	}
	
	public abstract class KeywordAnalyzer implements TextAnalyzer  {
		
		protected abstract String[] getKeywords();
		protected abstract Label getLabel();
	
		@Override
		public Label processText(String text) {
	        String[] keywords = getKeywords();
	        for (String keyword : keywords) {
	            if (text.contains(keyword)) {
	                return getLabel();
	            }
	        }
	        return Label.OK;
	    }
	}
	
	public class SpamAnalyzer extends KeywordAnalyzer {
		
		private String[] keywords;
		
		public SpamAnalyzer(String[] keywords) {
			this.keywords = keywords;
		}

		@Override
		protected String[] getKeywords() {
			return keywords;
		}

		@Override
		protected Label getLabel() {
			return Label.SPAM;
		}
	}
	
	public class NegativeTextAnalyzer extends KeywordAnalyzer {
		
		private final String[] KEYWORDS = {":(", "=(", ":|"};
		
		@Override
		protected String[] getKeywords() {
			return KEYWORDS;
		}

		@Override
		protected Label getLabel() {
			return Label.NEGATIVE_TEXT;
		}
	}
	
	public class TooLongTextAnalyzer implements TextAnalyzer {
		
		private int maxLength;
		
		public TooLongTextAnalyzer(int maxLength) {
			this.maxLength = maxLength;
		}
		
		@Override
		public Label processText(String text) {
			return text.length() > this.maxLength ? Label.TOO_LONG : Label.OK;
		}
	}
}