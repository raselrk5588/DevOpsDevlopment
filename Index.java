public class Main {

//   public static void main(String[] args) {
//   	System.out.println("Hello, World!"); 
//   }
  private Plan createPlan() {
    return new Plan(
            project(),
            "Plan Name", "PLANKEY")
            .description("Plan created from (enter repository url of your plan)")
            .stages(
                    new Stage("Stage 1")
                            .jobs(new Job("Run", "RUN")
                                    .tasks(
                                            new ScriptTask().inlineBody("echo Hello world!"))));
}
  
}