import UIKit
import app

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
      label.text = Proxy().proxyHello() +
        "\nProcessing platform: " + SampleKt.processingName() +
        "\nProcessing version: " + String(SampleKt.processingVersion())
      
      
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}
