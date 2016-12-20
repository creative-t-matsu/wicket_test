package jp.creative_matsu.wicket_sanple;

import java.util.Random;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

public class ReadOnlyModelPage extends WebPage{
	private static final long serialVersionUID = 1L;
	
	public ReadOnlyModelPage(){
		
		IModel<Integer> aroModel = new AbstractReadOnlyModel<Integer>(){
			private static final long serialVersionUID = 1L;
			
			@Override
			public Integer getObject(){
				return getRandomInt();
			}
		};
		
		Label ro1Label = new Label("ro1",aroModel);
		add(ro1Label);
		
		Label ro2Label = new Label("ro2",aroModel);
		add(ro2Label);
		
		Label ro3Label = new Label("ro3",aroModel);
		add(ro3Label);
		
		
		IModel<Integer> ldModel = new LoadableDetachableModel<Integer>(){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected Integer load(){
				return getRandomInt();
			}
		};
		
		Label ld1Label = new Label("ld1",ldModel);
		add(ld1Label);
		
		Label ld2Label = new Label("ld2",ldModel);
		add(ld2Label);
		
		Label ld3Label = new Label("ld3",ldModel);
		add(ld3Label);
	}
	
	public int getRandomInt(){
		return new Random().nextInt(100);
	}
}