package proxy.protectedproxy

class ReportGeneratorProtectionProxy(var staff: Staff)
  extends ReportGeneratorProxy {

  var reportGenerator: ReportGenerator = ReportGeneratorImpl()

  override def generateDailyReport: String =
    if (staff.isOwner) {
      reportGenerator.generateDailyReport
    } else {
      "Not Authorized to view report."
    }
}
