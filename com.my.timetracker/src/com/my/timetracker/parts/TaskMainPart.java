package com.my.timetracker.parts;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.my.timetracker.timetracker.Task;
import com.my.timetracker.timetracker.TimetrackerFactory;
import com.my.timetracker.timetracker.User;
import com.my.timetracker.writers.DataWriter;

import org.eclipse.swt.widgets.Button;

public class TaskMainPart {

	private Text txtArm;
	// private TableViewer tableViewer;
	private Combo comboTasks;
	private List<String> data = new ArrayList<String>();
	private DataWriter writer = new DataWriter();
	private User user = TimetrackerFactory.eINSTANCE.createUser();
	private Calendar currTaskStartTime ;

	public TaskMainPart() {
		// data.add("Sample item 1");
		// data.add("Sample item 2");
		// data.add("Sample item 3");
		// data.add("Sample item 4");
		// data.add("Sample item 5");
	}

	@Inject
	private MDirtyable dirty;
	private Text txtHours;
	private Text txt_minutes;
	private Button btnStart;
	private Button btnStop;

	@PostConstruct
	public void createComposite(Composite parent) {

		parent.setLayout(new GridLayout(3, false));

		Label lblArm = new Label(parent, SWT.NONE);
		lblArm.setText("ARM");
		txtArm = new Text(parent, SWT.BORDER);
		GridData gd_txtInput = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_txtInput.widthHint = 134;
		txtArm.setLayoutData(gd_txtInput);
		txtArm.setMessage("Enter ARM ID");
		txtArm.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dirty.setDirty(true);
			}
		});

		Label lblTask = new Label(parent, SWT.NONE);
		lblTask.setText("Task");
		comboTasks = new Combo(parent, SWT.BORDER);
		GridData gd_combo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_combo.widthHint = 140;
		comboTasks.setLayoutData(gd_combo);
		comboTasks.setItems("Alpha", "Bravo", "Charlie", "Dango");
		comboTasks.select(0);

		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("Estimate");

		txtHours = new Text(parent, SWT.BORDER);
		txtHours.setToolTipText("hours");
		GridData gd_txtMinutes = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtMinutes.widthHint = 42;
		txtHours.setLayoutData(gd_txtMinutes);

		txt_minutes = new Text(parent, SWT.BORDER);
		txt_minutes.setToolTipText("minutes");
		GridData gd_minutes = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_minutes.widthHint = 47;
		txt_minutes.setLayoutData(gd_minutes);
		new Label(parent, SWT.NONE);

		btnStart = new Button(parent, SWT.NONE);
		btnStart.setText("Start");
		btnStart.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					// System.out.println("Start Button pressed");
					if(validateStart()){
						// TODO: store time
						// TODO: enable Stop
					}
					currTaskStartTime = Calendar.getInstance();
					btnStop.setEnabled(true);
					break;
				}
			}
		});
		

		btnStop = new Button(parent, SWT.NONE);
		btnStop.setEnabled(false);
		btnStop.setText("Stop");
		btnStop.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					// System.out.println("Stop Button pressed");
					stopTask();
					if(btnStop.isEnabled()){
						btnStop.setEnabled(false);
					}
					resetAll();
					break;
				}
			}
		});
	}

	protected void resetAll() {
		// TODO reset all controls to default
	}

	protected void stopTask() {
		// TODO get end time
		// TODO write data
		Task e = TimetrackerFactory.eINSTANCE.createTask();
		e.setDescription(txtArm.getText());
		e.setTask(comboTasks.getText());
		e.setStartTime(currTaskStartTime.getTime());
		e.setEndsTime(Calendar.getInstance().getTime());
		
		user.getTasks().add(e);
		
		
	}

	protected boolean validateStart() {
		// TODO check if all are non-empty
		// TODO check if all are valid data
		return false;
	}

	@Focus
	public void setFocus() {
		txtArm.setFocus();
	}

	@Persist
	public void save() {
		// Add task data
		writer.writeToFile(user, "//test.xlsx");
		// tableViewer.setInput(getData());

		// Reset dirty state
		dirty.setDirty(false);
	}

	private void addData(String data) {
		if (data != null) {
			this.data.add(data.toString());
		}
	}
}