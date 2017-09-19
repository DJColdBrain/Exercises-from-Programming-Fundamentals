package teistermask.bindingModel;

import javax.validation.constraints.NotNull;

public class TaskBindingModel {

	@NotNull
    private String title;

	@NotNull
	private String status;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
