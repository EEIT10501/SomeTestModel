package test;

import model.User;
import service.UserServiceInter;
import service.impl.UserServiceImpl;

public class TestApp {

	public static void main(String[] args) {

		UserServiceInter userService = new UserServiceImpl();
//
//		User user = new User(null, "sam810331@gmail.com", "12345678", "0918500406", null, null, 2, 1, 3, 0,
//				1000 * 60 * 60 * 24 * 7, 0, null);

//		userService.saveUser(user);

		User user = userService.getUserById(1);
//		user.setRating(3.5);
//		System.out.println(user);
//		userService.updateUser(user);

//		JobServiceInter jobService = new JobServiceImpl();
//
//		Job job = new Job();
//		job.setTitle("賣場促銷");
//		job.setPostEndDate(Date.valueOf("2019-2-20"));
//		job.setIsFilled(false);
//		job.setViewTimes(0);
//		job.setApplicant(0);
//		job.setComment(null);
//		job.setReviewStatus(0);
//		job.setFailReason(null);
//		job.setIsExposure(false);
//		job.setUser(user);
//
//		JobDetail jobDetail = new JobDetail();
//		jobDetail.setIsCompany(true);
//		jobDetail.setIsLongTerm(false);
//		jobDetail.setDescription("於賣場進行產品促銷");
//		jobDetail.setOther("是否可配合教育訓練");
//		jobDetail.setIsRemote(false);
//		jobDetail.setAddress("內湖");
//		jobDetail.setAddressSup("西湖捷運站");
//		jobDetail.setCity("台北");
//		jobDetail.setPaidDate("每月10日");
//		jobDetail.setRateByHour(150);
//		jobDetail.setPhone("0918500406");
//		jobDetail.setEmail("sam810331@gmail.com");
//		jobDetail.setContact("石偉廷");
//		jobDetail.setIndustry("行銷類");
//		jobDetail.setPositionNum(2);
//
//		Schedule schedule = new Schedule();
//		schedule.setWorkDate(Date.valueOf("2019-2-17"));
//		schedule.setStartTime(Time.valueOf("11:00:00"));
//		schedule.setEndTime(Time.valueOf("19:00:00"));
//
//		jobService.saveJob(job, jobDetail, schedule);

	}

}
