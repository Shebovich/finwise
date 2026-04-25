//
// Created by Павел Урбанович on 25.04.26.
//

import SwiftUI
import Shared

extension Font {
    init(resource: KeyPath<MR.fonts, FontResource>, withSize: Double = 14.0) {
        self.init(MR.fonts()[keyPath: resource].uiFont(withSize: withSize))
    }
}