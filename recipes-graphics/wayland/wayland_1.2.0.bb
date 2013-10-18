SUMMARY = "Wayland, a protocol between a compositor and clients"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients \
as well as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and evdev \
input devices, an X application, or a wayland client itself. The clients can \
be traditional applications, X servers (rootless or fullscreen) or other \
display servers."
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=1d4476a7d98dd5691c53d4d43a510c72 \
                    file://src/wayland-server.c;endline=21;md5=079ae21dbf98ada52ec23744851b0a5c"

SRC_URI = "http://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "48d375afb15f3e68a72cf7b4fd8f4a63"
SRC_URI[sha256sum] = "6b0439a017185bc5b2fed96c178bed3abf7f19188f3078f4d69fd3ce222d654c"
inherit autotools pkgconfig

# We need wayland-native for the wayland-scanner utility
BBCLASSEXTEND = "native"

DEPENDS_virtclass-native = "expat-native libffi-native"
DEPENDS = "expat libffi wayland-native"

EXTRA_OECONF_virtclass-native = "--disable-documentation"
EXTRA_OECONF = "--disable-documentation --disable-scanner"
