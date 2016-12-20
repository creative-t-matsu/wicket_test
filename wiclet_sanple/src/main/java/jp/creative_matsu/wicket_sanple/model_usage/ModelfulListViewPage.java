package jp.creative_matsu.wicket_sanple.model_usage;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import jp.creative_matsu.wicket_sanple.User;

public class ModelfulListViewPage extends WebPage{
	private static final long serialVersionUID = 1L;
	
	public ModelfulListViewPage(){
		
		//--- 条件1：getUsers()メソッドの呼び出しにLoadableDetachableModelを使用する。
		//--- 条件2：ListView#populateItemメソッドで各ユーザーのデータを表示する部分にはCompoundPropertyModelを使用する。
		
		IModel<List<User>> ldModel = new LoadableDetachableModel<List<User>>(){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected List<User> load(){
				return getUsers();
			}
		};
		
		
		ListView<User> users = new ListView<User>("users",new CompoundPropertyModel<>(ldModel)){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void populateItem(ListItem<User> item){
				Label name = new Label("name", item.getModelObject().getName());
				item.add(name);
				
				Label age = new Label("age", item.getModelObject().getAge());
				item.add(age);
			}
		};
		add(users);
	}
	
	public List<User> getUsers(){
		List<User> list = new ArrayList<>(4);
		list.add(new User("宮林　椋太",20));
		list.add(new User("野中　茉莉花",21));
		list.add(new User("川上　優月",19));
		list.add(new User("稲岡　一馬",22));
		return list;
	}
}