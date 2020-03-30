package core.task357;

public class Task357 {

	public static void main(String[] args) {

	}
	
	public Label checkLabels(TextAnalyzer[] analyzers, String text) {
		return Label.OK;
	}
	
	abstract class KeywordAnalyzer  {
		
		protected abstract String[] getKeywords();
		
		protected abstract Label getLabel();
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
		
		@Override
		public Label processText(String text) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

		@Override
		protected String[] getKeywords() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected Label getLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Label processText(String text) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class TooLongTextAnalyzer implements TextAnalyzer {

		@Override
		public Label processText(String text) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	

}
