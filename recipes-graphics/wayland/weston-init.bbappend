FILESEXTRAPATHS_prepend := "${THISDIR}/weston-init"
SRC_URI = "file://init_app"

do_install() {
	install -d ${D}/${sysconfdir}/init.d
	install -m755 ${WORKDIR}/init_app ${D}/${sysconfdir}/init.d/weston
}
