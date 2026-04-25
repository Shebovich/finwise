import SwiftUI
import Shared

struct ContentView: View {
    @State private var showContent = false
    var body: some View {
        VStack(spacing: 0) {
            Image(uiImage: MR.images().splash.toUIImage()!)
                .resizable()
                .frame(width: 109, height: 115)

            Text(MR.strings().finwise.desc().localized())
                .font(Font(resource: \.poppins_semibold, withSize: 52.0))
                .foregroundColor(.white)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .center)
        .background(AppColors.mainGreen)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
