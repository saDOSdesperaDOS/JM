package core.task357;

public class Task357 {

	public static void main(String[] args) {

	}
	
	public Label checkLabels(TextAnalyzer[] analyzers, String text) {
		for (TextAnalyzer textAnalyzer : analyzers) {
			textAnalyzer.processText(text) != Label.OK ? retu ;
		}
		return Label.OK;
	}
	
	abstract class KeywordAnalyzer  {
		
		protected abstract String[] getKeywords();
		protected abstract Label getLabel();
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
	
	class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
		
		private String[] keywords;
		
		public SpamAnalyzer(String[] keywords) {
			this.keywords = keywords;
		}

		@Override
		protected String[] getKeywords() {
			// TODO Auto-generated method stub
			return keywords;
		}

		@Override
		protected Label getLabel() {
			// TODO Auto-generated method stub
			return Label.SPAM;
		}
	}
	
	class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
		
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
	
	class TooLongTextAnalyzer implements TextAnalyzer {
		
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
