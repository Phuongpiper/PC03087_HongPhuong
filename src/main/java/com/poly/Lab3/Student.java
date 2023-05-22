package com.poly.Lab3;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
		@NotBlank(message = "{Vui lòng nhập tên}")
	    String name;

	    @NotBlank(message = "{Vui lòng nhập email}")
	    @Email(message = "{Email.Student.email}")
	    String email;

	    @NotNull(message = "{Vui lòng chọn tuổi}")
	    @Min(value = 0, message = "{Số tuổi nhỏ nhất}")
	    @Max(value = 10, message = "{Số tuổi lớn nhất}")
	    Double marks;

	    @NotNull(message = "{Vui lòng chọn giới tính}")
	    Boolean gender;

	    @NotBlank(message = "{Vui lòng chọn ngành học}")
	    String faculty;

	    @NotEmpty(message = "{Vui lòng chọn sở thích}")
	    List<String> hobbies;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Double getMarks() {
			return marks;
		}

		public void setMarks(Double marks) {
			this.marks = marks;
		}

		public Boolean getGender() {
			return gender;
		}

		public void setGender(Boolean gender) {
			this.gender = gender;
		}

		public String getFaculty() {
			return faculty;
		}

		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		public List<String> getHobbies() {
			return hobbies;
		}

		public void setHobbies(List<String> hobbies) {
			this.hobbies = hobbies;
		}
	    
	    
	    
}
