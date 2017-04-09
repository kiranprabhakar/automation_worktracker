package com.my.timetracker.parts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TaskMainPart {

	private Text txtInput;
	//private TableViewer tableViewer;
	private Combo combo;
	private List<String> data = new ArrayList<String>();

	public TaskMainPart() {
//		data.add("Sample item 1");
//		data.add("Sample item 2");
//		data.add("Sample item 3");
//		data.add("Sample item 4");
//		data.add("Sample item 5");
	}

	@Inject
	private MDirtyable dirty;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		createTaskIDText(parent);
	    createTaskTypeCombo(parent);
//		createDataViewer(parent);
	}

	private void createTaskTypeCombo(Composite parent) {
		combo = new Combo (parent, SWT.BORDER);
		combo.setItems ("Alpha", "Bravo", "Charlie", "Dango");
		Rectangle clientArea = parent.getClientArea ();
		combo.setBounds (clientArea.x, clientArea.y, 200, 200);
		combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

//	private void createDataViewer(Composite parent) {
//		tableViewer = new TableViewer(parent);
//		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
//		tableViewer.setInput(getData());
//		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
//	}

	private void createTaskIDText(Composite parent) {
		txtInput = new Text(parent, SWT.BORDER);
		txtInput.setMessage("Enter ARM ID");
		txtInput.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dirty.setDirty(true);
			}
		});
		txtInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Focus
	public void setFocus() {
		txtInput.setFocus();
	}

	@Persist
	public void save() {
		//Add task data
		addData(txtInput.getText());
//		tableViewer.setInput(getData());
		
		//Reset dirty state
		dirty.setDirty(false);
	}

	private List<String> getData() {
		return data;
	}

	private void addData(String data) {
		if(data != null){
			this.data.add(data.toString());
		}
	}
}