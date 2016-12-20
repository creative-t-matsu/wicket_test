package jp.creative_matsu.wicket_sanple;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.util.ListModel;

public class ListViewPage extends WebPage{
	private static final long serialVersionUID = 1L;
	
	public ListViewPage(){
		List<String> prefectures = Arrays.asList("北海道","青森","岩手","秋田","宮城","福島");
		IModel<List<String>> prefecturesModel = new ListModel<>(prefectures);
		
		ListView<String> prefecturesView = new ListView<String>("prefectures",prefecturesModel){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void populateItem(ListItem<String> item){
				Label prefectureLabel = new Label("prefecture", item.getModel());
				item.add(prefectureLabel);
			}
		};
		add(prefecturesView);
	}
}